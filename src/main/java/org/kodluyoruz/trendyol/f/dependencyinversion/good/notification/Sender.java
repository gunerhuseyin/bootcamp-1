package org.kodluyoruz.trendyol.f.dependencyinversion.good.notification;


import com.sun.tools.javac.util.List;
import org.kodluyoruz.trendyol.f.dependencyinversion.good.notification.channel.Channel;

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
