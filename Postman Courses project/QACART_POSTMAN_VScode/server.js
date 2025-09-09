const jsonServer = require('json-server');
const auth = require('json-server-auth');
const path = require('path');

const server = jsonServer.create();
const router = jsonServer.router(path.join(__dirname, 'db.json'));
const middlewares = jsonServer.defaults();

// Set up the server to use the middleware
server.db = router.db;

server.use(middlewares);
server.use(auth);
server.use(router);

server.listen(3000, () => {
  console.log('JSON Server with auth is running on port 3000');
});
