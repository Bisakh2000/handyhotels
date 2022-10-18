import { Button } from 'bootstrap';
import React from 'react';
import { Link } from 'react-router-dom';

export default function Navbar() {
  return (
    <div>
    <nav className='navbar navbar-expand-lg navbar-dark bg-dark'>
    <div className = "container-fluid">
       
    <a className="navbar-brand" href=""> HandyHotels
        </a>
    <button className="navbar-toggler" 
    type="button" 
    data-toggle="collapse" 
    data-target="#navbarSupportedContent" 
    aria-controls="navbarSupportedContent" 
    aria-expanded="false" 
    aria-label="Toggle navigation">
      
    <span className="navbar-toggler-icon"></span>
    </button>

    <Link className="btn btn-outline-light" to="/addhotel">Add Hotel</Link>
    {/* <button className="btn btn-outline-light">Update User</button>
    <button className="btn btn-outline-light">View Users</button> */}
  
    </div>
  </nav>
    </div>
  )
}

