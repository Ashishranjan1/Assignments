package com.bookapp.model.exception;


public class BookNotFoundExceptions extends RuntimeException {



private static final long serialVersionUID = -3418431719850875550L;



public BookNotFoundExceptions(String cause) {
super(cause);
}

}