package com.ssdemo

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class PrivateController {

    def index() {
        render "Hello from private"

    }

    @Secured(['ROLE_SUPER_ADMIN'])
    def superAdmin()
    {
         render "super admin    "

    }

}
