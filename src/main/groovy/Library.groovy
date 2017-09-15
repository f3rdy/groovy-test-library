package org.ferdy.groove

class MathLibrary {

	def itemMap = [:]

    boolean returnTrue() {
        true
    }


    boolean returnFalse() {
        false
    }

    int add(x, y) {
    	return x+y 
    }

    def addItem(key, value) {
    	itemMap.put(key, value)
    }

    def getItem(key) {
    	if (itemMap.containsKey(key)) {
 			return itemMap[key]
    	}
    	throw KeyError('key not found')
    }
}

class KeyError extends Error {
	KeyError(String message) {
		super(message)
	}
}
