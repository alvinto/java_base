package com.yyw.proxy;

import java.lang.reflect.Method;

public interface Handle {
	Object invoke(Object proxy, Method method, Object[] args);
}
