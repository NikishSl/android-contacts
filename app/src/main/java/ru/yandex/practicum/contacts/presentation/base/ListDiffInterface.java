package ru.yandex.practicum.contacts.presentation.base;


public interface ListDiffInterface<T> {
    boolean theSameAs(T newItem);

    @Override
    boolean equals( Object object);
}
