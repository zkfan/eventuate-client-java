package io.eventuate;

import java.util.List;

public class Aggregates {
  public static <T extends Aggregate<T>> T applyEventsToMutableAggregate(T aggregate, List<Event> events) {
    for (Event event : events) {
      aggregate = aggregate.applyEvent(event);
    }
    return aggregate;
  }

  public static <T extends Aggregate<T>> T recreateAggregate(Class<T> clasz, List<Event> events) {
    try {
      return applyEventsToMutableAggregate(clasz.newInstance(), events);
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
