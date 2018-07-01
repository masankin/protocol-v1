package com.dg.game.infrastructure.protocol;

import java.io.Serializable;

import com.dg.game.infrastructure.error.ErrorCode;

/**
 * 响应的数据
 * @author jannal
 *
 * @param <T>
 */
public class ResponseBody<T> implements Serializable {
    
    private static final long serialVersionUID = 1L;
    public final static  String SUCCESS_MSG = "SUCCESS";
    public final static  String FAILED_MSG = "FAILED";
    public final static int SUCCESS_CODE = ErrorCode.NO_ERROR;// 成功
    public final static int FAILED_CODE = ErrorCode.OPERATION_FAILED;// 成功
    
    // 密钥(返回的密钥可以不要)
    private String hmac="hmac";
    //特殊意义的编码
    private int code;
    // 消息
    private String msg=SUCCESS_MSG;
    // 响应的数据
    private T data ;
 // 响应的数据总条数
    private int total;
    
    
    public ResponseBody() {
    }
    
    
    public ResponseBody(T data) {
        this.data = data;
    }


    public ResponseBody(String msg) {
        super();
        this.msg = msg;
    }
    public ResponseBody(int code,String msg) {
        super();
        this.msg = msg;
        this.code=code;
    }
    
    public ResponseBody(int code, String msg,T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    
    public static <T>  ResponseBody<T> defaultFail(){
        return new ResponseBody<T>(ResponseBody.FAILED_CODE,FAILED_MSG);
    } 
    
    public  static  <T> ResponseBody<T> defaultSuccess(){
        return new ResponseBody<T>(ResponseBody.SUCCESS_CODE,SUCCESS_MSG);
    }


	public String getHmac() {
		return hmac;
	}


	public void setHmac(String hmac) {
		this.hmac = hmac;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


    
}
