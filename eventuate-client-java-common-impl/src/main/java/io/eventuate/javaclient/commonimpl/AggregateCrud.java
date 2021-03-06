package io.eventuate.javaclient.commonimpl;

import io.eventuate.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface AggregateCrud {
  CompletableFuture<EntityIdAndVersion> save(String aggregateType, List<EventTypeAndData> events, Optional<SaveOptions> options);

  <T extends Aggregate<T>> CompletableFuture<LoadedEvents> find(String aggregateType, String entityId, Optional<FindOptions> findOptions);

  CompletableFuture<EntityIdAndVersion> update(EntityIdAndType entityIdAndType, Int128 entityVersion, List<EventTypeAndData> events, Optional<UpdateOptions> updateOptions);
}
