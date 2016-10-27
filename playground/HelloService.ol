include "console.iol"

interface InternalInterface {
  RequestResponse: pass
}

service Internal 
{
  Interfaces: InternalInterface
  main 
  {
    pass( req )(){
      println@Console( req.content )()
    }
  }
}

inputPort In {
  Location: "socket://localhost:15000"
  Protocol: sodep
  OneWay: close
  Redirects: Activity => Internal
}

execution{ concurrent }


main
{
  close()
}