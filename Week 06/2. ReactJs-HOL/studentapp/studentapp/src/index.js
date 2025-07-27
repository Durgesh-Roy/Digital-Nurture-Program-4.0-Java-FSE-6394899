import React from 'react';
import ReactDOM from 'react-dom/client';
import Home from './Home';
import About from './About';
import Contact from './Contact';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Home/>
    <About/>
    <Contact/>
  </React.StrictMode>
);

