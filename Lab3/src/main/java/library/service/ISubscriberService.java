package library.service;

import library.model.Subscriber;

public interface ISubscriberService {
    void registerSubscriber(Subscriber s);
    Subscriber findById(String id);
}
