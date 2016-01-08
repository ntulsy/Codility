using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Distinct;

namespace Codility.Test
{
    [TestClass]
    public class DistinctTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 1, 1, 2, 3, 1 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }


        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 4, 3, 1, 2, 0 , -2};
            int result = s.solution(A);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 2, 3, 4, 11111 };
            int result = s.solution(A);
            Assert.AreEqual(5, result);
        }
    }
}
