package com.scode.springjpa.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarManufacturerResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String brandName;
	private String about;
	private String establishment;
	private String headquarter;
	private Date createdAt;
	private String createdBy;

}
