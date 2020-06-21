package votingSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import java.util.Date;

public class CreatePDF {
	
	public static void main(String args[]) throws MalformedURLException, IOException
	{
		Document document = new Document();
		try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("VotingStats.pdf"));
	         document.open();
	         Image image = Image.getInstance("dyp.png");
	         document.add(image);

	         document.add(new Paragraph("VOTING STATISTICS REPORT", FontFactory.getFont(FontFactory.TIMES_BOLD,19,Font.BOLD,BaseColor.BLACK)));
	         document.add(new Paragraph(new Date().toString()));
	         
	         PdfPTable table = new PdfPTable(5);
	         
	         table.setWidthPercentage(105);
	         table.setSpacingBefore(11f);
	         table.setSpacingAfter(10f);
	         
	         float[] columnWidths = {1f, 1f, 1f, 1f, 1f};
	         table.setWidths(columnWidths);
	        
	         PdfPCell c1 = new PdfPCell(new Paragraph("Candidate ID"));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell c2 = new PdfPCell(new Paragraph("House"));
	         c2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell c3 = new PdfPCell(new Paragraph("Grade"));
	         c3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	       
	         PdfPCell c4 = new PdfPCell(new Paragraph("Position"));
	         c4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	         PdfPCell c5 = new PdfPCell(new Paragraph("Vote Count"));
	         c5.setHorizontalAlignment(Element.ALIGN_CENTER);
	         c5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         table.addCell(c1);
	         table.addCell(c2);
	         table.addCell(c3);
	         table.addCell(c4);
	         table.addCell(c5);
	         document.add(table);
	         
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


