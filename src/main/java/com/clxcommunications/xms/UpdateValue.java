package com.clxcommunications.xms;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Wrapper class for API objects used for update API methods. Allows
 * 
 * @param <T>
 *            the underlying API type
 */
@Value.Immutable
@ValueStylePackageDirect
@JsonInclude(Include.NON_NULL)
public abstract class UpdateValue<T> {

	/**
	 * Marker object signifying that the field should be removed.
	 */
	private static final UpdateValue<?> UNSET = ImmutableUpdateValue.of(null);

	@SuppressWarnings("unchecked")
	@Nonnull
	public static <T> UpdateValue<T> unset() {
		return (UpdateValue<T>) UNSET;
	}

	@JsonCreator
	@Nonnull
	public static <T> UpdateValue<T> set(@Nullable T value) {
		return ImmutableUpdateValue.of(value);
	}

	/**
	 * Returns the update value or <code>null</code> if unset.
	 * 
	 * @return the update value if set, <code>null</code> otherwise
	 */
	@JsonValue
	@Nullable
	public abstract T valueOrNull();

	/**
	 * Whether this update value is set or unset.
	 * 
	 * @return <code>true</code> if set; <code>false</code> otherwise
	 */
	public final boolean isSet() {
		return valueOrNull() != null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("UpdateValue{");
		if (isSet()) {
			sb.append("set=" + valueOrNull());
		} else {
			sb.append("unset");
		}
		sb.append("}");

		return sb.toString();
	}

}
