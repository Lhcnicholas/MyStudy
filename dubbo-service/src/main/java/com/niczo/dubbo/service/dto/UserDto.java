package com.niczo.dubbo.service.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author lhc
 */
@Data
public class UserDto implements Serializable {

	private static final long serialVersionUID = -3279962278157521125L;

	@NotBlank(groups = Add.class)
	private String name;

	public interface Add {

	}
}
