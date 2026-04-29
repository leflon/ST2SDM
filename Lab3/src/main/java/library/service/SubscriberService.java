package library.service;

import library.model.Subscriber;
import java.util.HashMap;
import java.util.Map;

public class SubscriberService implements ISubscriberService {
    private Map<String, Subscriber> subscribers = new HashMap<>();

    @Override
    public void registerSubscriber(Subscriber s) {
        if (s == null || s.getId() == null) {
            throw new IllegalArgumentException("Subscriber or subscriber ID must not be null");
        }
        subscribers.put(s.getId(), s);
    }

    @Override
    public Subscriber findById(String id) {
        return subscribers.get(id);
    }
}
