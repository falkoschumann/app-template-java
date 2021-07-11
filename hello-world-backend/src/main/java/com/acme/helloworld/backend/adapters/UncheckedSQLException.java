/*
 * Hello World - Backend
 * Copyright (c) 2021 ACME Ltd. <contact@acme.com>
 */

package com.acme.helloworld.backend.adapters;

import java.sql.SQLException;
import java.util.Objects;

public class UncheckedSQLException extends RuntimeException {
  public UncheckedSQLException(String message, SQLException cause) {
    super(message, Objects.requireNonNull(cause));
  }

  public UncheckedSQLException(SQLException cause) {
    super(Objects.requireNonNull(cause));
  }

  @Override
  public SQLException getCause() {
    return (SQLException) super.getCause();
  }
}
