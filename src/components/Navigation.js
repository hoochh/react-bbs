import React from 'react';
import { Link } from 'react-router-dom';

function Navigation() {
  return (
    <div className="nav">
      <Link to="/">Home</Link>
      <Link to="/write">Write</Link>
      <Link to="/detail">Detail</Link>
    </div>
  );
}

export default Navigation;
