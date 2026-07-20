import { BrowserRouter, Routes, Route } from "react-router-dom";

import Dashboard from "./pages/Dashboard/Dashboard";
import Accounts from "./pages/Accounts/Accounts";
import Customers from "./pages/Customers/Customers";
import Transactions from "./pages/Transactions/Transactions";
import Loans from "./pages/Loans/Loans";
import KYC from "./pages/KYC/KYC";
import Settings from "./pages/Settings/Settings";
import NotFound from "./pages/NotFound/NotFound";
import Login from "./pages/Login/Login";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/" element={<Dashboard />} />
        <Route path="/accounts" element={<Accounts />} />
        <Route path="/customers" element={<Customers />} />
        <Route path="/transactions" element={<Transactions />} />
        <Route path="/loans" element={<Loans />} />
        <Route path="/kyc" element={<KYC />} />
        <Route path="/settings" element={<Settings />} />
        <Route path="*" element={<NotFound />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;