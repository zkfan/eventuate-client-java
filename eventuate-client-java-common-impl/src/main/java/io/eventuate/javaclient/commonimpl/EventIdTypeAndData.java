package io.eventuate.javaclient.commonimpl;

import io.eventuate.Int128;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class EventIdTypeAndData {

  private Int128 id;
  private String eventType;
  private String eventData;

  public EventIdTypeAndData() {
  }

  public EventIdTypeAndData(Int128 id, String eventType, String eventData) {
    this.id = id;
    this.eventType = eventType;
    this.eventData = eventData;
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public Int128 getId() {
    return id;
  }

  public void setId(Int128 id) {
    this.id = id;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public String getEventData() {
    return eventData;
  }

  public void setEventData(String eventData) {
    this.eventData = eventData;
  }
}
