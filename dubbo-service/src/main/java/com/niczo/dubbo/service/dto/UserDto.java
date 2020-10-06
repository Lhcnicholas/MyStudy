package com.niczo.dubbo.service.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {

	private static final long serialVersionUID = -3279962278157521125L;
	private String name;
}
