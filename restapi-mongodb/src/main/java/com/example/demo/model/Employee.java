package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Document(collection = "employee")
public class Employee {
	@JsonProperty
	@Id 
	private @NonNull String id;

	@JsonProperty
	private @NonNull String firstName;

	@JsonProperty
	private @NonNull String lastName;

	@JsonProperty
	private @NonNull String email;
}