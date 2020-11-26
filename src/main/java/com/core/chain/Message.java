package com.core.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
	public String text;
	public MessagePriority priority;

}
