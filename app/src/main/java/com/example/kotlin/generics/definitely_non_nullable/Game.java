package com.example.kotlin.generics.definitely_non_nullable;

import androidx.annotation.NonNull;

public interface Game<T>{
     T save(T x);
     T load(@NonNull T x);
}
