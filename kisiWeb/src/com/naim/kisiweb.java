package com.naim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class kisiweb
 */
@WebServlet("/kisiweb")
public class kisiweb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 1L;
	
	ogrenci ogrn = new ogrenci();
	Ogretmen ogrt = new ogretmen();
	Memur mmr =new memur();
	ogretimgorevlisi og = new ogrgorevlisi();
	
    /**
     * Default constructor. 
     */
    public kisiweb() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ogrn.setTcno(10060275);
		ogrn.setAd("naim");
		ogrn.setmemleket("Kars");
		ogrn.setbolum("bil muh");
		
		
		ogrt.setAd("ismail");
		ogrt.setbolum("bilgisayar muh");
		ogrt.setsicilno("593");
	
        
	    og.setAd("ahmet");
        og.setTcno(345660260);
	    og.setalan("ozgur yazilim ");
	    og.setsicilno("4098");
	    og.setbolum("bilgisayar muh");
        
	    mmr.setAd("muhsin");
	    mmr.setGorev("yazicioglu");
	    mmr.setTcno(456882);
		
	    PrintWriter out=response.getWriter();
		response.getCharacterEncoding();
		out.println
		("<!DOCTYPE html>\n" +
		"<html>\n" +
		        "<head><title>A Test Servlet</title></head>\n" +
		        "<body bgcolor=\"#fdf5e6\">\n" +
		        "<h1> Bilgiler </h1>\n" +
		        "<p> <b>ogrenci bilgileri </b></p>\n" +
				"</body></html>");
		        out.println(ogrn.ogrencibilgisi() +
		        "<p> <br> <b>ogretmen bilgileri</b> </br> </p>\n" +
				ogrt.ogretmenbilgisi()+
				"<p> <br> <b>ogretim gorevlisi bilgileri</b> </br> </p>\n" +
				og.ogrtgrvbilgisi()+
				"<p> <br> <b>memur bilgileri</b> </br> </p>\n" +
				mmr.memurbilgisi());}
	}
/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
