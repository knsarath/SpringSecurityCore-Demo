package com.ssdemo

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class PublicController {

    def index() {
      render "hello from public"
    }
}
