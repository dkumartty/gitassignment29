package com.dhir.fsd.RestFulAPIAssignment21.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "book")
public class Book implements Serializable{

	@Id
    @Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookId;
    
    @Column(nullable = false)
	private String title;
    
    @Column(name = "price", nullable = false)
	private double price;
    
    @Column(name = "volume", nullable = false)
	private int volume;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "publish_date", nullable = false)
	private Date publishDate;

	public Book() {
	}
	
	public Book(long bookId, String title, double price, int volume, Date publishDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume = volume;
		this.publishDate = publishDate;
	}
    
	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
