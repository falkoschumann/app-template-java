/*
 * Hello World - Backend
 * Copyright (c) 2021 ACME Ltd. <contact@acme.com>
 */

package com.acme.helloworld.backend;

import com.acme.helloworld.contract.data.Bounds;

public interface PreferencesRepository {
  String loadGreeting();

  void storeGreeting(String greeting);

  Bounds loadMainWindowBounds();

  void storeMainWindowBounds(Bounds bounds);
}
