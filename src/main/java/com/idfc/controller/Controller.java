package com.idfc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.idfc.dao.Bankdao;
import com.idfc.dto.BankDto;


@org.springframework.stereotype.Controller
public class Controller {

BankDto bankDto =new BankDto();

Bankdao bankdao =new  Bankdao();

@RequestMapping("/signup")
public ModelAndView insert() {
	ModelAndView andView =new ModelAndView("insert.jsp");
	andView.addObject("saved", bankDto );
	return andView;
}
@ResponseBody
@RequestMapping("/insert")
public String savedata(BankDto recobject) {
	bankdao.insert(recobject);
	return "data inserted successfully";
}
@RequestMapping("/remove")
public ModelAndView delete() {
	ModelAndView  andView =new ModelAndView("delete.jsp");
	andView.addObject("deletedata", bankDto);
	return andView;
}
@ResponseBody
@RequestMapping("/delete")
public String deleted(int id) {
	bankdao.remove(id);
	return "data deleted successfully";
}
@ResponseBody
@RequestMapping("/fetchall")
public ModelAndView ftetch() {
	List<BankDto> bankDtos =(List<BankDto>)bankdao.fetch();
	ModelAndView andView =new ModelAndView("fetchall.jsp");
	andView.addObject("fetchdata", bankDtos);
	return andView;
}
}
