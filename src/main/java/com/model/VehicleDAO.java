package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import org.hibernate.query.Query;

public class VehicleDAO {
	private Transaction trans;
	private Session sess;
	private boolean b = true;
	
	public boolean insertProduct(Vehicle p) {
		try
		{
			DbConfig db = new DbConfig();
			sess = db.getSess();
			trans = sess.beginTransaction();
			sess.save(p);
			trans.commit();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
			b = false;
		}
		return b;
	}
	public List<Vehicle> getProducts()
	{
		Query<Vehicle> query = sess.createQuery("from Vehicle");
		List<Vehicle> lp = (List<Vehicle>)query.getResultList();
		
		return lp;
		
	}
}
