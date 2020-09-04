package org.kodluyoruz.trendyol.f.dependencyinversion.good.notification;


import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Channel;

import java.util.List;

public class Sender {
    private final List<Channel> channels;

    public Sender(List<Channel> channels) {
        this.channels = channels;
    }

    public void Send(String message) {
        for (Channel channel : this.channels) {
            channel.Send(message);
        }
    }

}
