package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Employee {
	@JsonProperty
	private @NonNull String id;

	@JsonProperty
	private @NonNull String firstName;

	@JsonProperty
	private @NonNull String lastName;

	@JsonProperty
	private @NonNull String email;
}