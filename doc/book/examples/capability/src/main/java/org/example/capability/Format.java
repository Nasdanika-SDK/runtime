package org.example.capability;

/**
 * A requirement payload: the format something is rendered in. A record, because a requirement is
 * a cache key within a resolution and payloads need value equality.
 */
public record Format(String name) {
}
