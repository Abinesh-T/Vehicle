package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.model.Vehicle;
import com.model.VehicleDAO;
import com.niit.Ecommerce_backend.Model.CategoryModel;

@Controller
public class VehicleController {
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView view = new ModelAndView("Details");
		view.addObject("HeaderName", "Welcome to Products Page");
		return view;
	}
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView success(@ModelAttribute("product1")Vehicle product) {
		
		ModelAndView view = new ModelAndView("view");
		view.addObject("HeaderName", "Welcome to Vehicle Details Page");
		List<Vehicle> c=VehicleDAO.getProducts();
		view.addObject("list",c);
		
		/*view.addObject("VechileSpeed",product.getvSpeed());
		view.addObject("VechileLt",product.getvLt());
		view.addObject("VechileLg",product.getvLg());
		*/
		return view;
		
	}
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public ModelAndView productSuccess(@ModelAttribute("product1")Vehicle product)
	{
		ModelAndView mv = new ModelAndView("success");
		mv.addObject("VechileId",product.getvID());
	/*	mv.addObject("VechileSpeed",product.getvSpeed());
		mv.addObject("VechileLt",product.getvLt());
		mv.addObject("VechileLg",product.getvLg());
		*/
		VehicleDAO pd = new VehicleDAO();
		pd.insertProduct(product);
		
		return mv;
	}
	
	
}
