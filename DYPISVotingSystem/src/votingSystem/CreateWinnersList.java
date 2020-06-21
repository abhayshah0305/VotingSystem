package votingSystem;

//Importing
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

//Method to generate a PDF file called WinnersList
public class CreateWinnersList {
	
	public static void main(String args[]) throws MalformedURLException, IOException
	{
		Object[] bh = new Object[6];
		Object[] gh = new Object[6];
		Object[] rh = new Object[6];
		Object[] yh = new Object[6];
		Object[] hb = new Object[6];
		Object[] hg = new Object[6];
		Object[] sm = new Object[6];
		Object[] sf = new Object[6];
		
		Document document = new Document();
		try
	      {
			VotingSystem_Main f = new VotingSystem_Main();
			//a = f.findWinnerListbh();
			//Create a new PDF called WinnersList
			 PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("WinnersList.pdf"));
	         document.open();
	         Image image = Image.getInstance("dyp.png");
	         document.add(image);

	         document.add(new Paragraph("WINNERS LIST REPORT", FontFactory.getFont(FontFactory.TIMES_BOLD,19,Font.BOLD,BaseColor.BLACK)));
	         document.add(new Paragraph(new Date().toString()));
	         document.add(new Paragraph("BLUE HOUSE CAPTAIN & VICE CAPTAIN", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.BLUE)));
	         
	         //Create new Table with 6 columns
	         PdfPTable table = new PdfPTable(5);
	         
	         table.setWidthPercentage(105);
	         table.setSpacingBefore(11f);
	         table.setSpacingAfter(10f);
	         
	         float[] columnWidths = {1f, 1f, 1f, 1f, 1f};
	         table.setWidths(columnWidths);
	        
	         PdfPCell c1 = new PdfPCell(new Paragraph("Candidate ID"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell c2 = new PdfPCell(new Paragraph("Name"));
	         c2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell c3 = new PdfPCell(new Paragraph("House"));
	         c3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell c4 = new PdfPCell(new Paragraph("Position"));
	         c4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell c5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         c5.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         
	         bh = f.findWinnerListbh();
	         table.addCell(c1);
	         table.addCell(c2);
	         table.addCell(c3);
	         table.addCell(c4);
	         table.addCell(c5);
	         table.addCell(bh[0].toString());
	         table.addCell(bh[1].toString());
	         table.addCell(bh[2].toString());
	         table.addCell(bh[3].toString());
	         table.addCell(bh[5].toString());
	         
	         
	         document.add(table);
	         
	         
	         document.add(new Paragraph("GREEN HOUSE CAPTAIN & VICE CAPTAIN", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.GREEN)));
	         
	         PdfPTable table1 = new PdfPTable(5);
	         
	         table1.setWidthPercentage(105);
	         table1.setSpacingBefore(11f);
	         table1.setSpacingAfter(10f);
	         
	         float[] columnWidths1 = {1f, 1f, 1f, 1f, 1f};
	         table1.setWidths(columnWidths1);
	        
	         PdfPCell d1 = new PdfPCell(new Paragraph("Candidate ID"));
	         d1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         d1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell d2 = new PdfPCell(new Paragraph("Name"));
	         d2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         d2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell d3 = new PdfPCell(new Paragraph("House"));
	         d3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         d3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell d4 = new PdfPCell(new Paragraph("Position"));
	         d4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         d4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell d5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         d5.setHorizontalAlignment(Element.ALIGN_CENTER);
	         d5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         gh = f.findWinnerListgh();
	         table1.addCell(d1);
	         table1.addCell(d2);
	         table1.addCell(d3);
	         table1.addCell(d4);
	         table1.addCell(d5);
	         table1.addCell(gh[0].toString());
	         table1.addCell(gh[1].toString());
	         table1.addCell(gh[2].toString());
	         table1.addCell(gh[3].toString());
	         table1.addCell(gh[5].toString());
	         
	         
	         document.add(table1);
	         
	        
	         document.add(new Paragraph("RED HOUSE CAPTAIN & VICE CAPTAIN", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.RED)));
	         
	         PdfPTable table2 = new PdfPTable(5);
	         
	         table2.setWidthPercentage(105);
	         table2.setSpacingBefore(11f);
	         table2.setSpacingAfter(10f);
	         
	         float[] columnWidths2 = {1f, 1f, 1f, 1f, 1f};
	         table2.setWidths(columnWidths2);
	        
	         PdfPCell e1 = new PdfPCell(new Paragraph("Candidate ID"));
	         e1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         e1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell e2 = new PdfPCell(new Paragraph("Name"));
	         e2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         e2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell e3 = new PdfPCell(new Paragraph("House"));
	         e3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         e3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell e4 = new PdfPCell(new Paragraph("Position"));
	         e4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         e4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell e5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         e4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         e4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         rh = f.findWinnerListrh();
	         table2.addCell(e1);
	         table2.addCell(e2);
	         table2.addCell(e3);
	         table2.addCell(e4);
	         table2.addCell(e5);
	         table2.addCell(rh[0].toString());
	         table2.addCell(rh[1].toString());
	         table2.addCell(rh[2].toString());
	         table2.addCell(rh[3].toString());
	         table2.addCell(rh[5].toString());
	         
	         document.add(table2);
	         
	         
	         document.add(new Paragraph("YELLOW HOUSE CAPTAIN & VICE CAPTAIN", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.YELLOW)));
	         
	         PdfPTable table3 = new PdfPTable(5);
	         
	         table3.setWidthPercentage(105);
	         table3.setSpacingBefore(11f);
	         table3.setSpacingAfter(10f);
	         
	         float[] columnWidths3 = {1f, 1f, 1f, 1f, 1f};
	         table3.setWidths(columnWidths3);
	        
	         PdfPCell f1 = new PdfPCell(new Paragraph("Candidate ID"));
	         f1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         f1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell f2 = new PdfPCell(new Paragraph("Name"));
	         f2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         f2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell f3 = new PdfPCell(new Paragraph("House"));
	         f3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         f3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell f4 = new PdfPCell(new Paragraph("Position"));
	         f4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         f4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell f5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         f4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         f4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         yh = f.findWinnerListyh();
	         table3.addCell(f1);
	         table3.addCell(f2);
	         table3.addCell(f3);
	         table3.addCell(f4);
	         table3.addCell(f5);
	         table3.addCell(yh[0].toString());
	         table3.addCell(yh[1].toString());
	         table3.addCell(yh[2].toString());
	         table3.addCell(yh[3].toString());
	         table3.addCell(yh[5].toString());
	         
	         document.add(table3);
	         
	         
	         document.add(new Paragraph("HEAD BOY", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.DARK_GRAY)));
	         
	         PdfPTable table4 = new PdfPTable(5);
	         
	         table4.setWidthPercentage(105);
	         table4.setSpacingBefore(11f);
	         table4.setSpacingAfter(10f);
	         
	         float[] columnWidths4 = {1f, 1f, 1f, 1f, 1f};
	         table4.setWidths(columnWidths4);
	        
	         PdfPCell g1 = new PdfPCell(new Paragraph("Candidate ID"));
	         g1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         g1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell g2 = new PdfPCell(new Paragraph("Name"));
	         g2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         g2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell g3 = new PdfPCell(new Paragraph("House"));
	         g3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         g3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell g4 = new PdfPCell(new Paragraph("Position"));
	         g4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         g4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell g5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         g5.setHorizontalAlignment(Element.ALIGN_CENTER);
	         g5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         hb = f.findWinnerListhb();
	         table4.addCell(g1);
	         table4.addCell(g2);
	         table4.addCell(g3);
	         table4.addCell(g4);
	         table4.addCell(g5);
	         table4.addCell(hb[0].toString());
	         table4.addCell(hb[1].toString());
	         table4.addCell(hb[2].toString());
	         table4.addCell(hb[3].toString());
	         table4.addCell(hb[5].toString());
	         
	         document.add(table4);
	         
	         
	         document.add(new Paragraph("HEAD GIRL", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.DARK_GRAY)));
	         
	         PdfPTable table5 = new PdfPTable(5);
	         
	         table5.setWidthPercentage(105);
	         table5.setSpacingBefore(11f);
	         table5.setSpacingAfter(10f);
	         
	         float[] columnWidths5 = {1f, 1f, 1f, 1f, 1f};
	         table5.setWidths(columnWidths5);
	        
	         PdfPCell h1 = new PdfPCell(new Paragraph("Candidate ID"));
	         h1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         h1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell h2 = new PdfPCell(new Paragraph("Name"));
	         h2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         h2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell h3 = new PdfPCell(new Paragraph("House"));
	         h3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         h3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell h4 = new PdfPCell(new Paragraph("Position"));
	         h4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         h4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell h5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         h4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         h4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         hg = f.findWinnerListhg();
	         table5.addCell(h1);
	         table5.addCell(h2);
	         table5.addCell(h3);
	         table5.addCell(h4);
	         table5.addCell(h5);
	         table5.addCell(hg[0].toString());
	         table5.addCell(hg[1].toString());
	         table5.addCell(hg[2].toString());
	         table5.addCell(hg[3].toString());
	         table5.addCell(hg[5].toString());
	         
	         document.add(table5);
	         
	         
	         document.add(new Paragraph("SPORTS CAPTAIN (Male)", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.DARK_GRAY)));
	         
	         PdfPTable table6 = new PdfPTable(5);
	         
	         table6.setWidthPercentage(105);
	         table6.setSpacingBefore(11f);
	         table6.setSpacingAfter(10f);
	         
	         float[] columnWidths6 = {1f, 1f, 1f, 1f, 1f};
	         table6.setWidths(columnWidths6);
	        
	         PdfPCell i1 = new PdfPCell(new Paragraph("Candidate ID"));
	         i1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         i1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell i2 = new PdfPCell(new Paragraph("Name"));
	         i2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         i2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell i3 = new PdfPCell(new Paragraph("House"));
	         i3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         i3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell i4 = new PdfPCell(new Paragraph("Position"));
	         i4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         i4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell i5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         i4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         i4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         sm = f.findWinnerListsm();
	         table6.addCell(i1);
	         table6.addCell(i2);
	         table6.addCell(i3);
	         table6.addCell(i4);
	         table6.addCell(i5);
	         table6.addCell(sm[0].toString());
	         table6.addCell(sm[1].toString());
	         table6.addCell(sm[2].toString());
	         table6.addCell(sm[3].toString());
	         table6.addCell(sm[5].toString());
	         
	         document.add(table6);
	         
	         
	         document.add(new Paragraph("SPORTS CAPTAIN (Female)", FontFactory.getFont(FontFactory.TIMES_BOLD,14,BaseColor.DARK_GRAY)));
	         
	         PdfPTable table7 = new PdfPTable(5);
	         
	         table7.setWidthPercentage(105);
	         table7.setSpacingBefore(11f);
	         table7.setSpacingAfter(10f);
	         
	         float[] columnWidths7 = {1f, 1f, 1f, 1f, 1f};
	         table7.setWidths(columnWidths7);
	        
	         PdfPCell j1 = new PdfPCell(new Paragraph("Candidate ID"));
	         j1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         j1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell j2 = new PdfPCell(new Paragraph("Name"));
	         j2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         j2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell j3 = new PdfPCell(new Paragraph("House"));
	         j3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         j3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell j4 = new PdfPCell(new Paragraph("Position"));
	         j4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         j4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell j5 = new PdfPCell(new Paragraph("Votes Obtained"));
	         j4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         j4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         sf = f.findWinnerListsf();
	         table7.addCell(j1);
	         table7.addCell(j2);
	         table7.addCell(j3);
	         table7.addCell(j4);
	         table7.addCell(j5);
	         table7.addCell(sf[0].toString());
	         table7.addCell(sf[1].toString());
	         table7.addCell(sf[2].toString());
	         table7.addCell(sf[3].toString());
	         table7.addCell(sf[5].toString());
	         
	         document.add(table7);
	         
	         
	         document.close();
	         writer.close();
	      } 
			catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } 
			catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
		
		
	   }
	
	}




