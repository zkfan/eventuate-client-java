package io.eventuate.javaclient.commonimpl;

import io.eventuate.EventContext;
import io.eventuate.Int128;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SerializedEvent {
  private Int128 id;
  private String entityId;
  private String entityType;
  private String eventData;
  private String eventType;
  private Integer swimLane;
  private Long offset;
  private EventContext eventContext;

  public SerializedEvent(Int128 id, String entityId, String entityType, String eventData, String eventType, Integer swimLane, Long offset, EventContext eventContext) {
    this.id = id;
    this.entityId = entityId;
    this.entityType = entityType;
    this.eventData = eventData;
    this.eventType = eventType;
    this.swimLane = swimLane;
    this.offset = offset;
    this.eventContext = eventContext;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }


  public Int128 getId() {
    return id;
  }

  public void setId(Int128 id) {
    this.id = id;
  }

  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getEventData() {
    return eventData;
  }

  public void setEventData(String eventData) {
    this.eventData = eventData;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Integer getSwimLane() {
    return swimLane;
  }

  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public EventContext getEventContext() {
    return eventContext;
  }
}
