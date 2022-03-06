package com.bookapp.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "title", "price", "author" })
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book_Table")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private Double price;
	private String author;

	public Book(String title, Double price, String author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}

	public Object getPrice() {
		return price;	}

	public void setPrice(Object price2) {
		price=(Double) price2;
	}

}