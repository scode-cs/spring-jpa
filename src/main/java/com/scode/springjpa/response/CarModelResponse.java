package com.scode.springjpa.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CarModelResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String modelName;
	private String details;
	private CarManufacturerResponse manufacturer;
	private CarBodyTypeResponse bodyType;
	private Date createdAt;
	private String createdBy;

}
