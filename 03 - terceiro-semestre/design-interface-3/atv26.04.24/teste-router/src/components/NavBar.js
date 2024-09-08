import React from "react";
import styles from "./NavBar.module.css";
import { NavLink } from "react-router-dom";

const NavBar = () => {
  return (
    <nav className={styles.navbar}>
      <NavLink to="/" className={styles.brand}>
        CHOCOLATERIA<span> | FARIA</span>
      </NavLink>
      <ul className={styles.links_list}>
        <li>
          <NavLink to="/">Home</NavLink>          
        </li>
        <li>
          <NavLink to="/about">Sobre</NavLink>          
        </li>
        <li>
          <NavLink to="/login">Login</NavLink>          
        </li>
        <li>
          <NavLink to="/register">Register</NavLink>          
        </li>
        
      </ul>
    </nav>
  );
};

export default NavBar;