package br.unitins.unijato.validation;

import br.unitins.unijato.application.ValidationException;

public interface Validation<T> {
	public void validate(T t) throws ValidationException;
}