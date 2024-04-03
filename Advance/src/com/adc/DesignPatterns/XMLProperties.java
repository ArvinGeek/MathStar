/*  Final���Ƚ��ܽ�

����DOM4J������ã���Sun��JAXMҲ����DOM4J��Ŀǰ��࿪Դ��Ŀ�д�������DOM4J���������������HibernateҲ��DOM4J����ȡXML�����ļ�����������ǿ���ֲ�ԣ��ǾͲ���DOM4J��
      JDOM��DOM�����ܲ���ʱ���ֲ��ѣ��ڲ���10M�ĵ�ʱ�ڴ��������С�ĵ�����»�ֵ�ÿ���ʹ��DOM��JDOM����ȻJDOM�Ŀ������Ѿ�˵��������������ʽ���а�ǰרע�������⣬���Ǵ����ܹ۵���������ȷʵû��ֵ���Ƽ�֮�������⣬DOM����һ���ǳ��õ�ѡ��DOMʵ�ֹ㷺Ӧ���ڶ��ֱ�����ԡ����������������XML��صı�׼�Ļ�������Ϊ����ʽ���W3C�Ƽ�������ڷǱ�׼��Javaģ����ԣ���������ĳЩ���͵���Ŀ�п���Ҳ��Ҫ��������JavaScript��ʹ��DOM����
      SAX���ֽϺã���Ҫ���������ض��Ľ�����ʽ���¼�������һ��SAX��⼴��������XML��������û�����뵽�ڴ棨��Ȼ��XML��������ʱ�����в����ĵ���ʱ�������ڴ��У���

*/

package com.adc.DesignPatterns;

//import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.soap.Node;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//import com.sun.org.apache.bcel.internal.classfile.Attribute;
import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;

//import org.xml.*;
/**
 * @author yshic
 *
 */
public class XMLProperties 
{
	public XMLProperties() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) throws MalformedURLException, DocumentException{
    	//DomParser();
    	//DOM4JParser();
    	SAXParser();
    }
    /*һ��DOM����
  ����DOM��ȫ����Document Object Model��Ҳ���ĵ�����ģ��
    */
    public static void DomParser()
    {
        //����һ��DocumentBuilderFactory�Ķ���
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //����һ��DocumentBuilder�Ķ���
        try {
            //����DocumentBuilder����
            DocumentBuilder db = dbf.newDocumentBuilder();
            //ͨ��DocumentBuilder�����parser��������books.xml�ļ�����ǰ��Ŀ��
            org.w3c.dom.Document document = db.parse("books.xml");
            //��ȡ����book�ڵ�ļ���
            NodeList bookList = document.getElementsByTagName("book");
            //ͨ��nodelist��getLength()�������Ի�ȡbookList�ĳ���
            System.out.println("һ����" + bookList.getLength() + "����");
            //����ÿһ��book�ڵ�
            for (int i = 0; i < bookList.getLength(); i++) {
                System.out.println("=================���濪ʼ������" + (i + 1) + "���������=================");
                //ͨ�� item(i)���� ��ȡһ��book�ڵ㣬nodelist������ֵ��0��ʼ
                org.w3c.dom.Node book = bookList.item(i);
                //��ȡbook�ڵ���������Լ���
                NamedNodeMap attrs = book.getAttributes();
                System.out.println("�� " + (i + 1) + "���鹲��" + attrs.getLength() + "������");
                //����book������
                for (int j = 0; j < attrs.getLength(); j++) {
                    //ͨ��item(index)������ȡbook�ڵ��ĳһ������
                    org.w3c.dom.Node attr = attrs.item(j);
                    //��ȡ������
                    System.out.print("��������" + attr.getNodeName());
                    //��ȡ����ֵ
                    System.out.println("--����ֵ" + attr.getNodeValue());
                }
                //����book�ڵ���ӽڵ�
                NodeList childNodes = book.getChildNodes();
                //����childNodes��ȡÿ���ڵ�Ľڵ����ͽڵ�ֵ
                System.out.println("��" + (i+1) + "���鹲��" + 
                childNodes.getLength() + "���ӽڵ�");
                for (int k = 0; k < childNodes.getLength(); k++) {
                    //���ֳ�text���͵�node�Լ�element���͵�node
                    if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
                        //��ȡ��element���ͽڵ�Ľڵ���
                        System.out.print("��" + (k + 1) + "���ڵ�Ľڵ�����" 
                        + childNodes.item(k).getNodeName());
                        //��ȡ��element���ͽڵ�Ľڵ�ֵ
                        System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getFirstChild().getNodeValue());
                        //System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getTextContent());
                    }
                }
                System.out.println("======================����������" + (i + 1) + "���������=================");
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }         	
    }

    /*
     * 4��DOM4J����

������  ������

������������1��JDOM��һ�����ܷ�֧�����ϲ�����೬������XML�ĵ���ʾ�Ĺ��ܡ�

������������2����ʹ�ýӿںͳ�������෽����

������������3�������������졢����Ժá�����ǿ��ͼ������õ��ص㡣

������������4����һ������Դ����ļ�
     * 
     * */
    public static void DOM4JParser()
    {
        // ����books.xml�ļ�
        // ����SAXReader�Ķ���reader
        SAXReader reader = new SAXReader();
        try {
            // ͨ��reader�����read��������books.xml�ļ�,��ȡdocuemnt����
            Document document = reader.read(new File("books.xml"));
            // ͨ��document�����ȡ���ڵ�bookstore
            Element bookStore = document.getRootElement();
            // ͨ��element�����elementIterator������ȡ������
            Iterator it = bookStore.elementIterator();
            // ��������������ȡ���ڵ��е���Ϣ���鼮��
            while (it.hasNext()) {
                System.out.println("=====��ʼ����ĳһ����=====");
                Element book = (Element) it.next();
                // ��ȡbook���������Լ� ����ֵ
                List<Attribute> bookAttrs = book.attributes();
                for (Attribute attr : bookAttrs) {
                    System.out.println("��������" + attr.getName() + "--����ֵ��"
                            + attr.getValue());
                }
                Iterator itt = book.elementIterator();
                while (itt.hasNext()) {
                    Element bookChild = (Element) itt.next();
                    System.out.println("�ڵ�����" + bookChild.getName() + "--�ڵ�ֵ��" + bookChild.getStringValue());
                }
                System.out.println("=====��������ĳһ����=====");
            }
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static ArrayList<Book> booksList = new ArrayList<Book>(); 

	
	 

    public static void SAXParser()
    {
        //��ȡһ��SAXParserFactory��ʵ��
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //ͨ��factory��ȡSAXParserʵ��
        try {
            javax.xml.parsers.SAXParser parser = factory.newSAXParser();
            //����SAXParserHandler����
            SAXParserHandler2 handler = new SAXParserHandler2();
            parser.parse("books.xml", handler);
            booksList = handler.getBookList();
            System.out.println("~��~��~������" + booksList.size()
                    + "����");
            for (Book book : booksList) 
            {
                System.out.println(book.getId());
                System.out.println(book.getName());
                System.out.println(book.getAuthor());
                System.out.println(book.getYear());
                System.out.println(book.getPrice());
                System.out.println(book.getLanguage());
                System.out.println("----finish----");
            }
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } 
    
}

 




