package org.spiderflow.core.io;

import java.io.InputStream;
import java.util.Map;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.spiderflow.io.SpiderResponse;

import com.alibaba.fastjson.JSON;

/**
 * 响应对象包装类
 * @author Administrator
 *
 */
public class HttpResponse implements SpiderResponse{
	
	private Response response;

	private String htmlValue;

	private Object jsonValue;

	public HttpResponse(Response response) {
		super();
		this.response = response;
	}
	
	@Override
	public int getStatusCode(){
		return response.statusCode();
	}
	
	@Override
	public String getHtml(){
		if(htmlValue == null){
			htmlValue =  response.body();
		}
		return htmlValue;
	}
	
	@Override
	public Object getJson(){
		if(jsonValue == null){
			jsonValue = JSON.parse(getHtml());
		}
		return jsonValue;
	}
	
	@Override
	public Map<String,String> getCookies(){
		return response.cookies();
	}
	
	@Override
	public Map<String,String> getHeaders(){
		return response.headers();
	}
	
	@Override
	public byte[] getBytes(){
		return response.bodyAsBytes();
	}
	
	@Override
	public String getContentType(){
		return response.contentType();
	}

	@Override
	public void setCharset(String charset) {
		this.response.charset(charset);
	}

	@Override
	public String getUrl() {
		return response.url().toExternalForm();
	}

	@Override
	public InputStream getStream() {
		return response.bodyStream();
	}
}
