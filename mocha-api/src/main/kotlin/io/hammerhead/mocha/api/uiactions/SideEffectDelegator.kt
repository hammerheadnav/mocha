package io.hammerhead.mocha.api.uiactions

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class SideEffectDelegator<K, T>(val build: (T)-> Unit) : ReadWriteProperty<K, T> {
    override fun getValue(thisRef: K, property: KProperty<*>): T {
        throw UnsupportedOperationException("not implemented")
    }

    override fun setValue(thisRef: K, property: KProperty<*>, value: T) {
        build(value)
    }

}
