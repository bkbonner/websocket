From the 'pythonserver' directory.

1. ensure the virtual environment is setup.   This should be automatic if running visual studio code from this directory.
1. launch gunicorn using

   `gunicorn -k flask_sockets.worker server:app`
   
   where `server` is the name of the python module (file) and `app` is the variable inside the module `server` to run.
1. open a separate vs code window and launch 'flutterclient' and run it in 'chrome'.   When you send a **\<message\>** from the client, it will send a message to the server and it will log:  **Received \<message\>**