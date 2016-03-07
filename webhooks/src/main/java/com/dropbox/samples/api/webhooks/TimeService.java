package com.dropbox.samples.api.webhooks;

import java.time.LocalTime;

public class TimeService {
  public LocalTime getTime() {
    return LocalTime.now();
  }
}