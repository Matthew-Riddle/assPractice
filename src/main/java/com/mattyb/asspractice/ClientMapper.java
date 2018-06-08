package com.mattyb.asspractice;

import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ClientMapper {


	ClientDto toDto(Client adress);
	
	Client fromDto(ClientDto dto);
	
}
