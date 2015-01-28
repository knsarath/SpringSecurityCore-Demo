import com.ssdemo.auth.*;

class BootStrap {

    def init = { servletContext ->

        def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
        def superAdmin = Role.findOrSaveWhere(authority:'ROLE_SUPER_ADMIN')
        def user = User.findOrSaveWhere(username: 'knsarath',password: '123',firstName: "SARATH",lastName: "K N",emailAddress: "knsarath@live.com")
        if(!user.authorities.contains(adminRole))
           {
               UserRole.create(user,adminRole,true)
           }


    }
    def destroy = {
    }
}
