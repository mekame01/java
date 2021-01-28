package com.kh.filter;

public class Run {

	public static void main(String[] args) {
//		new B_FileIO().fileInOut();
//		new A_BufferedIO().bufferedWithFile();
		B_BufferedWR bwr = new B_BufferedWR();
//		bwr.bufferedReader();
//		bwr.bufferedWriter();
		
		C_ObjectIO oio = new C_ObjectIO();
//		oio.objectOutput();
//		oio.objectInputStream();
		D_StreamWR swr = new D_StreamWR();
//		swr.writerWithStream();
//		swr.readerWithStream();
//		new C_ObjectIO2().objectOutput();
		new E_PrintWriter().printWriter();
	}

}
