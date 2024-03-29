package com.marya.utils.valid;

import com.marya.utils.valid.annotations.PhoneNumber;

/**
 * @author muludag on 4.05.2020
 */
public class PhoneNumberClientValidationConstraint extends AbstractClientValidationConstraint {

	public static final String MESSAGE_METADATA = "data-p-email-msg";

	public PhoneNumberClientValidationConstraint() {
		super(null, MESSAGE_METADATA);
	}

	public String getValidatorId() {
		return PhoneNumber.class.getSimpleName();
	}

}
