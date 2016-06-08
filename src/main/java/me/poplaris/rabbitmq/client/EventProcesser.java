package me.poplaris.rabbitmq.client;


public interface EventProcesser {
	public void process(Object e);
}
