package org.nervos.neuron.service.http;

import rx.Subscriber;

/**
 * Created by duanyytop on 2018/9/6
 */
public class NeuronSubscriber<T> extends Subscriber<T> {

    @Override
    public void onCompleted() {

    }
    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }
    @Override
    public void onNext(T t) {

    }
}
